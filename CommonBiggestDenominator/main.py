

def common_denominator(values):
    """
    Find the biggest common denominator for a list of values. We try to find the biggest common denominator
    by starting with the biggest value in the list and then decrementing it until we find a value that is
    a common denominator for all values in the list, while we explore different values
    we keep track of the division results and skip them if we already explored them.
    """
    theoretical_max = min(values)
    skip_values = []
    for i in reversed(range(1, theoretical_max+1)):
        if i in skip_values:
            continue

        r = [value%i for value in values]
        if all([sub_r == 0 for sub_r in r]):
            return i
        else:
            skip_values.append(i)
            skip_values.append([
                value//i for value in values
            ])

def common_denominator_euclidean(values):
    """
    We use the Euclidean algorithm to find the biggest common denominator. The Euclidean algorithm
    is based on the fact that the biggest common denominator of two numbers is the same as the biggest
    common denominator of the remainder of the division of the two numbers.
    """
    values = sorted(values)
    def euclidean(a, b):
        if b == 0:
            return a
        else:
            return euclidean(b, a%b)

    if len(values) == 2:
        return euclidean(values[0], values[1])
    else:
        return euclidean(values[0], common_denominator_euclidean(values[1:]))

if __name__=="__main__":
    test_values = [42,56,14]
    print(common_denominator(test_values))
    print(common_denominator_euclidean(test_values))
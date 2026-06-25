def mergesort(x, st, en):
    if st >= en:
        return
    mid = (st + en) // 2
    mergesort(x, st, mid)
    mergesort(x, mid + 1, en)
    merge(x, st, mid, en)


def merge(x, st, mid, en):
    left = x[st:mid + 1]
    right = x[mid + 1:en + 1]
    i = 0
    j = 0
    k = st

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            x[k] = left[i]
            i += 1
        else:
            x[k] = right[j]
            j += 1
        k += 1

    while i < len(left):
        x[k] = left[i]
        i += 1
        k += 1

    while j < len(right):
        x[k] = right[j]
        j += 1
        k += 1


a = [1, 5, 3, 2, 6, 5, 7]
mergesort(a, 0, len(a) - 1)
print(a)

    
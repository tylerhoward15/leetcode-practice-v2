/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    if (m == 0) {
        for (const [blah, value] of nums2.entries()) {
            nums1[blah] = value;
        }
    }

    if (n == 0) {
        return nums1;
    }

    const res = new Array(m+n);
    let onei = 0;
    let twoi = 0;
    for (let i = 0; i < res.length; i++) {
        const temp1 = nums1[onei];
        const temp2 = nums2[twoi];

        if (onei >= m) {
            res[i] = nums2[twoi];
            twoi++;
        } else if (twoi >= n) {
            res[i] = nums1[onei];
            onei++;
        } else {
            if (temp1 < temp2) {
                res[i] = temp1;
                onei++;
            } else {
                res[i] = temp2;
                twoi++;
            }
        }
    }

    for (let i=0; i < res.length; i++) {
        nums1[i] = res[i];
    }
};
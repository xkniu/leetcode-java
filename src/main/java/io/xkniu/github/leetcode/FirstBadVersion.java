package io.xkniu.github.leetcode;

/**
 * #278, https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion {

    private int firstBadVersion;

    public FirstBadVersion(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    /**
     * 注意结果可能为 Integer.MAX_VALUE，index 移动的时候需要避免溢出
     */
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return isBadVersion(r) ? r : -1;
    }

    private boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }

    public void setFirstBadVersion(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }
}

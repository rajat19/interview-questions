class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.length < t.length) return ""

        val tmap = IntArray(128)
        val smap = IntArray(128)

        for (c in t) {
            tmap[c.code]++
        }

        var left = 0
        var right = 0
        var minLen = Int.MAX_VALUE
        var minStart = 0
        var formed = 0
        val required = t.count { it.isLetterOrDigit() || it.isWhitespace() || true }.let {
            tmap.count { it > 0 }
        }

        while (right < s.length) {
            val rc = s[right].code
            smap[rc]++
            if (tmap[rc] > 0 && smap[rc] == tmap[rc]) {
                formed++
            }

            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1
                    minStart = left
                }

                val lc = s[left].code
                smap[lc]--
                if (tmap[lc] > 0 && smap[lc] < tmap[lc]) {
                    formed--
                }
                left++
            }

            right++
        }

        return if (minLen == Int.MAX_VALUE) "" else s.substring(minStart, minStart + minLen)
    }
}

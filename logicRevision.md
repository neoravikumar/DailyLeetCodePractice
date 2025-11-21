DSA Revision Notes — Week 1

1. Contains Duplicate
- Pattern: HashSet
- Logic: Add each num to set; if exists → true.
- TC: O(n)

2. Two Sum
- Pattern: HashMap
- Logic: map stores (value → index). Check complement.
- TC: O(n)

3. Intersection of Arrays
- Pattern: HashSet
- Logic: add nums1 to set; check nums2.
- TC: O(n)

4. Valid Anagram
- Pattern: HashMap freq
- Logic: count chars in s; subtract using t.
- TC: O(n)

5. Valid Palindrome
- Pattern: Two pointers
- Logic: skip non-alphanumeric; compare chars.
- TC: O(n)

Pattern Guide:
- HashSet → membership, duplicates, intersection
- HashMap → frequency, complement, counting
- Two pointers → palindrome, sorted merging
- Sliding window → longest substring, k-window

Time Complexities:
- HashMap/Set ops O(1)
- Two pointers O(n)
- Sorting O(n log n)

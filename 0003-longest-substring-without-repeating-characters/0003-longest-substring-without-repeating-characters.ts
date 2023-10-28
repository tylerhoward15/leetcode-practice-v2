function lengthOfLongestSubstring(s: string): number {
    let maxSize: number = 0;
    let left: number = 0;
    let current: string = "";

    for (let right: number = 0; right<s.length; right++) {
        current += s.charAt(right);

        while(!isUnique(s, left, right+1)) {
            current = current.slice(1);
            left++;
        }
        maxSize = current.length > maxSize ? current.length : maxSize;
    }
    return maxSize;
};

function isUnique(str: string, left: number, right: number): boolean {
    const substr = str.substring(left,right);
    const set: Set<string> = new Set(substr.split(''));
    return set.size == substr.length;
}
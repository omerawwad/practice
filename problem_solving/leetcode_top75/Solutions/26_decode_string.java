class Solution {
    public String decodeString(String s) {
        LinkedList<StringBuilder> stream = new LinkedList<>();
        LinkedList<Integer> repeat = new LinkedList<>();
        int k=0;
        StringBuilder csb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)) k = k * 10 + (c - '0');
            else if(c == ']') {
                int r = repeat.pop();
                StringBuilder psb = stream.pop();
                for(;r-->0;) psb.append(csb);
                csb = psb;

            }
            else if(c == '[') {
                repeat.push(k);
                k=0;

                stream.push(csb);
                csb = new StringBuilder();
            }
            else {
                csb.append(c);
            }
        }
        return csb.toString();
    }
}
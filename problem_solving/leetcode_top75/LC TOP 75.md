# LC TOP 75

### 26. Decode String #important 

[Solution](/problem_solving/leetcode_top75/Solutions/26_decode_string.java)

**Parsing Integer From Characters**

```java
int k=0;
if(Character.isDigit(c)) k = k * 10 + (c-'0');
```

**Linked List As A Stack**

```java
LinkedList<StringBuilder> stk = new LinkedList<>();
stk.push(sb);
StringBilder prev = stk.pop();
```

**StringBuilder Append**

```java
StringBuilder sb1 = new StringBuilder();
StringBuilder sb2 = new StringBuilder();

sb1.append(sb2);
```
# LC TOP 75

## 26. Decode String #important 

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

## 27.  Number Of Recent Call

[Solution](/problem_solving/leetcode_top75/Solutions/27_number_of_recent_calls.java)

```java
for(;s<e && (t-ts[s])>3000;)s++; // brackets enhance speed
```

## 28. Data2 Senate

[Solution](/problem_solving/leetcode_top75/Solutions/28_data2_senate.java)

```java
Queue<Integer> q = new LinkedList<>();
q.offer(2);
q.peek();
q.poll();
q.isEmpty();
```

## 29. Delete Linked List Middle Node

[Solution](/problem_solving/leetcode_top75/Solutions/29_linkedlist_middle_node.java)

## 30. Delete Linked List Middle Node

[Solution](/problem_solving/leetcode_top75/Solutions/30_odd_even_nodes.java)

Avoid Cyclic Reference 

```java
eventmp.next = null;
```

## 31.  Reverse Linked List

[Solution](/problem_solving/leetcode_top75/Solutions/31_reverse_linkedlist.java)

## 32. Maximum Twin Sum Of A Linked List

[Solution](/problem_solving/leetcode_top75/Solutions/32_max_twin_sum.java)



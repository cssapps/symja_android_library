## ArcCos

```
ArcCos(expr)
```

> returns the arc cosine (inverse cosine) of `expr` (measured in radians).
 
`ArcCos(expr)` will evaluate automatically in the cases `Infinity, -Infinity, 0, 1, -1`.

### Examples

```
>> ArcCos(0)
Pi/2
 
>> ArcCos(1)
0

>> Integrate(ArcCos(x), {x, -1, 1})
Pi
```
   
    
## Dynamic Formulas

#### Description

This is a simple library for parsing mathematical expressions in O(n) time. It can handle numbers and variables, and calculate the result of expressions on the fly.

Formulas also includes support for boolean algebra with the tokens `true` and `false`. As in C, `0` evaluates to `false`, and any number that is not `0` evaluates to `true`.

#### How to Use

To parse mathematical expressions, use `Parse.parse(String)`. Simply pass in a string, such as `"3(4+5)"` and it will transform it into a data structure that can later be evaluated.

#### Examples

`Parser.parse("3+4").calculate()` -> `7`</br>
`Parser.parse("true&&false").calculate()` -> `0`

#### Supported operators
<table>
  <th>
    Precedence
  </th>
  <th>
    Symbol
  </th>
  <th>
    Description
  </th>
  <tr>
    <td>3</td>
    <td>*</td>
    <td>Multiplication</td>
  </tr>
</table>

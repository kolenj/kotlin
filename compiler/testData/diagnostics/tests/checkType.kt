// !CHECK_TYPE
// !WITH_NEW_INFERENCE

interface A
interface B : A
interface C : B

fun test(b: B) {
    b checkType { _<B>() }
    b checkType { <!TYPE_MISMATCH!>_<!><A>() }
    b checkType { <!TYPE_MISMATCH!>_<!><C>() }
}

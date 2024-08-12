error id: file:///C:/Users/dimuthu%20harshamal/Desktop/FP/practical8/11.scala:[527..527) in Input.VirtualFile("file:///C:/Users/dimuthu%20harshamal/Desktop/FP/practical8/11.scala", "object CaesarCipher{

  def encrypt(text: String, shift: Int): String ={
    text.map{
      case c if c.isLetter =>{
        val shiftBase = if (c.isUpper) 'A' else 'a'
        ((c- shiftBase + shift)% 26 + shiftBase).toChar
      }
      case c => c
    }
  }

  def decrypt(text: String, shift: Int): String ={
    text.map {
    case c if c.isLetter =>
      val shiftBase = if (c.isUpper) 'A' else 'a'
      ((c - shiftBase - shift + 26) % 26 + shiftBase).toChar
    case c => c 
    }
  }
}

object ")
file:///C:/Users/dimuthu%20harshamal/Desktop/FP/practical8/11.scala
file:///C:/Users/dimuthu%20harshamal/Desktop/FP/practical8/11.scala:23: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof
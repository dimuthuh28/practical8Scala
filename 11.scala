object CaesarCipher{

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
object Cipher{

  def cipher(text: String, shift: Int, cipherFunction: (String, Int) => String): String = {
    cipherFunction(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    // Encryption
    val encryptedText = cipher(plaintext, shift, CaesarCipher.encrypt)
    println(s"Encrypted: $encryptedText")

    // Decryption
    val decryptedText = cipher(encryptedText, shift, CaesarCipher.decrypt)
    println(s"Decrypted: $decryptedText")
  }


}
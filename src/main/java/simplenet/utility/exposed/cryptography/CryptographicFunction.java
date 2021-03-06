/*
 * MIT License
 *
 * Copyright (c) 2019 Jacob Glickman
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package simplenet.utility.exposed.cryptography;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import simplenet.Client;

/**
 * Provides users with the capability to specify their own cryptographic scheme(s) for encrypting/decrypting data.
 *
 * @see Client#setEncryptionCipher(Cipher)
 * @see Client#setDecryptionCipher(Cipher)
 */
@FunctionalInterface
public interface CryptographicFunction {
    
    /**
     * Performs encryption/decryption of a {@code byte[]} given a {@link Cipher}.
     *
     * @param cipher The {@link Cipher} used to encrypt/decrypt the specified {@code byte[]}.
     * @param data   The data to encrypt/decrypt.
     * @return The modified data after it has been encrypted/decrypted by the {@link Cipher}
     * @throws GeneralSecurityException if an exception occurred while encrypting/decrypting.
     */
    byte[] apply(Cipher cipher, byte[] data) throws GeneralSecurityException;
   
}
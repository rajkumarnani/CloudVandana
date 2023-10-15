function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = [];

    for (const word of words) {
        const reversedWord = word.split('').reverse().join('');
        reversedWords.push(reversedWord);
    }

    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}


const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"

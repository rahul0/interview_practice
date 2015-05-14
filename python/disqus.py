import sys
import string
"""
Implement the has_badwords function in the code below to return a boolean if the
message contains a badword in it or not.  A badword is contained in the message
if the word appears in the sentence, ignoring adjacent punctuation and case.
"""

sentences = [
    "I now took the measure of the bench, and found that it was a foot too short; but that could be mended with a chair.",
    "But it was a foot too narrow, and the other bench in the room was about four inches higher than the planed one--so there was no yoking them.",
    "I then placed the first bench lengthwise along the only clear space against the wall, leaving a little interval between, for my back to settle down in.",
    "But I soon found that there came such a draught of cold air over me from under the sill of the window, that this plan would never do at all, especially as another current from the rickety door met the one from the window, and both together formed a series of small whirlwinds in the immediate vicinity of the spot where I had thought to spend the night.",
    "The devil fetch that harpooneer, thought I, but stop, couldn't I steal a march on him--bolt his door inside, and jump into his bed, not to be wakened by the most violent knockings? It seemed no bad idea; but upon second thoughts I dismissed it.",
    "For who could tell but what the next draught, so soon as I popped out of the room, the harpooneer might be standing in the entry, all ready to knock me down!"
]

badwords = set(['window', 'chair', 'knockings'])

def  translate_punctuation(message):
    """
    remove punctuation character.
    """
    return ''.join([ ch for ch in   message if ch not in string.punctuation ])

def has_bad_words(message):
    #print 'message: ' +    message
    clean_message=translate_punctuation(message).lower()
    #print 'cleaned lowered message: ' +   clean_message
    return  True if badwords &  set(clean_message.split(' '))  else  False




if __name__=='__main__':
    for index, sentence in enumerate(sentences):
        if has_bad_words(sentence):
            sys.stdout.write(str(index))
            #raw_input('----\n')
else:
    pass

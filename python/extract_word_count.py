
files='pE_169 pE_216 pE_356 pE_368 pE_499 pJ_169 pJ_216 pJ_356 pJ_368 pJ_499 p_128 p_141 p_149 p_191 p_20 p_21 p_210 p_214 p_22 p_23 p_25 p_26 p_266 p_29 p_30 p_303 p_31 p_34 p_35 p_36 p_37 p_38 p_39 p_40 p_41 p_42 p_422 p_43 p_44 p_45 p_46 p_47 p_477 p_48 p_49 p_50 p_51 p_53 p_55 p_56 p_96 p_97 p_98'.split()
#files='pE_169 pE_216'.split()
openingTag='<:t:>'
closingTag='<:/t:>'


def extract_word_count(sentence, filename ):
   """extract count of tagged tokens """
   # discard punctuations
   punctuations=set([',','.', openingTag, closingTag])

   total_word_count=0
   if sentence=='':
      return total_word_count

   sentence=sentence.replace( openingTag.upper(),openingTag ).replace( closingTag.upper(), closingTag)
   sentence=sentence.replace(openingTag,' ').replace(closingTag,' ')
   tokens= sentence.split(' ')


   for  token in tokens:
       if token.strip() not in punctuations and len(token.strip()):
           total_word_count=total_word_count+1

   return total_word_count



if __name__=='__main__':

    for  f in files:
        content=' '.join(open(f).readlines())
        print'{}:{} '.format(f,extract_word_count(content, f))

else:
    pass



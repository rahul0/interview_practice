from collections import  Counter
from sys import  out as terminal


class Database:
    commands={'BEGIN', 'SET','GET', 'ROLLBACK', 'NUMEQUALTO', 'UNSET', 'COMMIT' }

    def __init__(self):
        self.is_transaction_block_mode_on= False
        self.db=dict()
        self.counter= Counter()
        self._transactions=Stack()

    def  get_cache(self):

        if _transactions.empty():
            return  (None, None)
        insert_cache, delete_cache= _transactions.peek()
        return  (insert_cache, delete_cache)

    def discard_recent_cache(self):
        """discard recent transaction block"""
        if _transactions.empty():
            return
        _transactions.pop()


    def  commit(self):
        """clear the cache."""

        insert_cache, delete_cache=get_cache()

        if not (insert_cache or delete_cache):
            print 'NO TRANSACTION'
            return

        if ni  len(insert_cache) + len(delete_cache):
            print 'NO TRANSACTION'
            return

        # discard recent transaction block
        discard_recent_cache()



    def rollback(self):
        """remove insert_cache contents from db , insert back delete_cache to db, reconstruct the counters complexity: O(n)"""

        if not (len(insert_cache) + len(delete_cache)) :
            print 'NO TRANSACTION'
            return

        #add back the contents  of delete buffer to main db
        for key in insert_cache.keys():
            db.pop(key, None)

        db.update(insert_cache)
        insert_cache={}
        #reintiialize counter 
        counter=Counter([ val for val in  db.itervalues() ])


    def  get(self, key, val):
        """check buffer then db, if they are empty"""
        return  db[key] if  key in db  else  'NULL'


    def set(self, key, value):

        # update=> delete + insertion
        if key in db:
            delete_cache[key]=db[key]
            counter[db[key]]=counter[db[key]]-1  if  counter[db[key]] >0  else 0

        # insertion
        db[key]=value
        insert_cache[key]=value
        counter.update({value:1})


    def unset(self, key):
        """SILENT removal of key """
        if key  not in db:
            return

        delete_cache[key]= db[key]
        del db[key]
        counter[delete_cache[key]] = counter[delete_cache[key]]-1 if counter[delete_cache[key]] > 0 else 0



    def end(self):
        """close db connectioni, No side effect."""
        self.connection_open=False

    def begin(self):
        """start a new transaction block"""
        self.isTranssactionModeOn=True


    def counter_update(self, key, val):
        """if any existing variable is  with same value, then check before updating the count """
        pass

    def numequlato(self, value):
        """find number of occurence of value"""
        pass




    def execute_command(self, command):
       #TODO complte this function 
        # coonection closed
        if  not  connection_open:
            print  'NO DB CONNECTION '
            return




if __name__=='__main__':
    db=Database()



else:
   print ''

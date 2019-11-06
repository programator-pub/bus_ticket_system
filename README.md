# bus-ticket-system  
Bus Ticket System  
-zamodelowac klienta  
-zamodelowac bilet (rozne warianty: ulgowy, studencki, normalny, senior)  
-zamodelowac trase przejazdu  
-dodawanie klienta  
-kupowanie biletu na konkretna trase przez klienta  
-polaczenia autobusowe sa hardkodowane  
-listowanie klientow  
-listowanie polaczen  
-listowanie dostepnych biletow  


git init - tworzy repozytorium lokalnie  
git remote add origin [adres_repo.git]  
git remote -v - listuje dostepne repozytoria zdalne  


git add [regex/nazwa pliku] - dodaj plik  
git add *.java  
git commit -m "commit message..." - tworzy commita  
git push origin master - wysyla zmiany do remote repo  


git fetch [origin] - pobiera zmiany ze zdalnego repo  
git merge - scala zmiany lokalne i te pobrane  
git pull = git fetch + git merge  
git rebase - zaciaga zmiany i doklada na wierzch naszego kod lokalny (zmodyfikowany)  

git checkout -b "nowy_feature_branch" "branch_od_którego_się_odbijamy"  
git checkout -b "user_interface" "origin/master"  

standardowa scieżka: commit -> rebase -> push  

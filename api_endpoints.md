# List of Resources
|Resources found in a zoo simulation      |
|-----------------------------------------|
|Zoo                                      |
|Enclosures                               |
|Handlers                                 |
|Veterinarians                            |
|Managers                                 |
|Visitors                                 |
|Shops                                    |
|Products                                 |
|Tickets                                  |
|Hospitals                                |
|Lectures                                 |
|Order                                    |
|Animals                                  |
|Ticketshops                              |


## RESTful APIS in a simulated zoo

|Resource                                 | HTTP Verb |Resource URL                                                  |Use Case Representation                                               |
|-----------------------------------------|-----------|--------------------------------------------------------------|----------------------------------------------------------------------|
|TicketShops                              | GET       |/zoos/{id}/ticketshops/{1}                                    |Visit ticket shop                                                     |
|Tickets                                  | POST      |/zoos/{id}/ticketshops/{1}                                    |Buy a ticket                                                          |
|Zoos                                     | GET       |/zoos/{id}                                                    |Enter the Zoo                                                         |
|Tickets                                  | GET       |/visitors/{id}/tickets/{id}                                   |Show a Valid Ticket                                                   |
|Tasks                                    | GET       |/visitors/{id}/tasks                                          |Visitors can select from tasks                                        |
|Enclosures                               | GET       |/zoos/{id}/enclosures/{id}                                    |Visit an Enclosure                                                    |
|Animals                                  | POST      |/zoos/{id}/enclosures/{id}/animals/{id}                       |Feed an Animal                                                        |
|Shops                                    | GET       |/zoos/{id}/shops/{id}                                         |Visit a Shop                                                          |
|Orders                                   | POST      |/zoos/{id}/shops/{id}/orders                                  |Make a Purchase                                                       |
|Hospitals                                | GET       |/zoos/{id}/hospitals/{id}                                     |Visit the Hospital                                                    |
|Lectures                                 | GET       |/zoos/{id}/hospitals/{id}/lectures/{id}                       |Listen to a Science Lecture                                           |
|Animals                                  | DELETE    |/zoos/{id}/animals                                            |Remove all animals                                                    |
|Animals                                  | POST      |/zoos/{id}/enclosures/{id}/animals                            |add new animal in enclosure                                           |
|Enclosures                               | PUT       |/zoos/{id}/enclosures/{id}/animals/{id}                       |transfer animal to another enclosure                                  |
|Veterinarians                            | GET       |/zoos/{id}/hospitals/{id}/veterinarians/{id}                  |Consult the vet                                                       |
|Products                                 | GET       |/zoos/{id}/shops/{id}/products                                |View all products in a shop                                           |
|Products                                 | POST      |/zoos/{id}/shops/{id}/products/{id}                           |Add new product in a shop                                             |
|Products                                 | PUT       |/zoos/{id}/shops/{id}/products/{id}                           |Update product inventory                                              |

## Actual Endpoints in a RESTful API Service
|Resource                                 | HTTP Verb |Resource URL                                                  |Use Case Representation                                               |
-----------------------------------------|-----------|--------------------------------------------------------------|----------------------------------------------------------------------|
|Zoos                                     | GET       |/zoos                                                         |Get the list of all zoos                                              |
|Zoos                                     | GET       |/zoos/{zoo_id}                                                |Get data of a specific zoo resource                                   |
|Zoos                                     | POST      |/zoos                                                         |Create new zoo resource                                               |
|Zoos                                     | PUT       |/zoos/{zoo_id}                                                |Modify a specific zoo resource                                        |
|Zoos                                     | DELETE    |/zoos/{zoo_id}                                                |Delete a specific zoo resource                                        |
|Enclosures                               | GET       |/zoos/{zoo_id}/enclosures                                     |Get the list of all enclosures in a zoo                               |
|Enclosures                               | GET       |/zoos/{zoo_id}/enclosures/{enclosure_id}                      |Get data of a specific enclosure                                      |
|Enclosures                               | POST      |/zoos/{zoo_id}/enclosures                                     |Create an enclosure resource                                          |
|Enclosures                               | PUT       |/zoos/{zoo_id}/enclosures/{enclosure_id}                      |Modify a specific enclosure resource                                  |
|Enclosures                               | DELETE    |/zoos/{zoo_id}/enclosures/{enclosure_id}                      |Delete a specific enclosure resource                                  |
|Handlers                                 | GET       |/zoos/{zoo_id}/handlers                                       |Get the list of all handlers in a specific zoo                        |
|Handlers                                 | GET       |/zoos/{zoo_id}/handlers/{handler_id}                          |Get the data of a specific handler in a specific zoo                  |
|Handlers                                 | POST      |/zoos/{zoo_id}/handlers                                       |Create a handler resource in a specific zoo                           |
|Handlers                                 | PUT       |/zoos/{zoo_id}/handlers/{handler_id}                          |Modify a handler resource in a specific zoo                           |
|Handlers                                 | DELETE    |/zoos/{zoo_id}/handlers/{handler_id}                          |Delete a handler resource in a specific zoo                           |
|Veterinarians                            | GET       |/zoos/{zoo_id}/veterinarians                                  |Get the list of all veterinarians in a specific zoo                   |
|Veterinarians                            | GET       |/zoos/{zoo_id}/veterinarians/{veterinarian_id}                |Get the data of a specific veterinarian in a specific zoo             |
|Veterinarians                            | POST      |/zoos/{zoo_id}/veterinarians                                  |Create a veterinarian resource in a specific zoo                      |
|Veterinarians                            | PUT       |/zoos/{zoo_id}/veterinarians/{veterinarian_id}                |Modify a handler resource in a specific zoo                           |
|Veterinarians                            | DELETE    |/zoos/{zoo_id}/veterinarians/{veterinarian_id}                |Delete a handler resource in a specific zoo                           |
|Managers                                 | GET       |/zoos/{zoo_id}/managers                                       |Get the list of all managers in a specific zoo                        |
|Managers                                 | GET       |/zoos/{zoo_id}/managers/{managers_id}                         |Get the data of a specific manager in a specific zoo                  |
|Managers                                 | POST      |/zoos/{zoo_id}/managers                                       |Create a manager resource in a specific zoo                           |
|Managers                                 | PUT       |/zoos/{zoo_id}/managers/{managers_id}                         |Modify a manager resource in a specific zoo                           |
|Managers                                 | DELETE    |/zoos/{zoo_id}/managers/{managers_id}                         |Delete a manager resource in a specific zoo                           |
|Visitors                                 | GET       |/zoos/{zoo_id}/visitors                                       |Get the list of all visitors of a specific zoo                        |
|Visitors                                 | GET       |/zoos/{zoo_id}/visitors/{visitor_id}                          |Get the data of a specific visitor of a specific zoo                  |
|Visitors                                 | POST      |/zoos/{zoo_id}/visitors                                       |Create a visitor resource of a specific zoo                           |
|Visitors                                 | PUT       |/zoos/{zoo_id}/visitors/{visitor_id}                          |Modify a visitor resource of a specific zoo                           |
|Visitors                                 | DELETE    |/zoos/{zoo_id}/visitors/{visitor_id}                          |Delete a visitor resource of a specific zoo                           |
|Shops                                    | GET       |/zoos/{zoo_id}/shops                                          |Get the list of all shops in a specific zoo                           |
|Shops                                    | GET       |/zoos/{zoo_id}/shops/{shop_id}                                |Get the data of a specific shop in a specific zoo                     |
|Shops                                    | POST      |/zoos/{zoo_id}/shops                                          |Create a shop resource in a specific zoo                              |
|Shops                                    | PUT       |/zoos/{zoo_id}/shops/{shop_id}                                |Modify a shop resource in a specific zoo                              |
|Shops                                    | DELETE    |/zoos/{zoo_id}/shops/{shop_id}                                |Delete a shop resource in a specific zoo                              |
|Products                                 | GET       |/zoos/{zoo_id}/products                                       |Get the list of all products in a specific zoo                        |
|Products                                 | GET       |/zoos/{zoo_id}/shops/{shop_id}/products                       |Get the list of all products in a specific shop of a zoo              |
|Products                                 | GET       |/zoos/{zoo_id}/shops/{shop_id}/products/{product_id}          |Get the details of a specific product in a specific shop of a zoo     |
|Products                                 | POST      |/zoos/{zoo_id}/shops/{shop_id}/products                       |Create a product resource in a specfic shop of a zoo                  |
|Products                                 | PUT       |/zoos/{zoo_id}/shops/{shop_id}/products/{product_id}          |Modify a product resource in a specfic shop of a zoo                  |
|Products                                 | DELETE    |/zoos/{zoo_id}/shops/{shop_id}/products/{product_id}          |Delete a product resource in a specfic shop of a zoo                  |
|Tickets                                  | GET       |/zoos/{zoo_id}/tickets                                        |Get the list of all sold tickets in a zoo                             |
|Tickets                                  | GET       |/zoos/{zoo_id}/ticketshops/{ticketshop_id}/tickets            |Get the list of all sold tickets in a specific ticketshop in a zoo    |
|Tickets                                  | GET       |/zoos/{zoo_id}/ticketshops/{ticketshop_id}/tickets/{ticket_id}|Get the details of a specific ticket in a specific ticketshop in a zoo|
|Tickets                                  | POST      |/zoos/{zoo_id}/ticketshops/{ticketshop_id}/tickets            |Create a ticket resource in a specific ticketshop in a zoo            |
|Tickets                                  | PUT       |/zoos/{zoo_id}/ticketshops/{ticketshop_id}/tickets/{ticket_id}|Modify a ticket resource in a specific ticketshop in a zoo            |
|Tickets                                  | DELETE    |/zoos/{zoo_id}/ticketshops/{ticketshop_id}/tickets/{ticket_id}|Delete a ticket resource in a specific ticketshop in a zoo            |
|TicketShops                              | GET       |/zoos/{zoo_id}/ticketshops                                    |Get the list of all ticketshops in a zoo                              |
|TicketShops                              | GET       |/zoos/{zoo_id}/ticketshops/{ticketshop_id}                    |Get the details of a specific ticketshop in a zoo                     |
|TicketShops                              | POST      |/zoos/{zoo_id}/ticketshops                                    |Create a ticketshop resource in a zoo                                 |
|TicketShops                              | PUT       |/zoos/{zoo_id}/ticketshops/{ticketshop_id}                    |Modify a ticketshop resource in a zoo                                 |
|TicketShops                              | DELETE    |/zoos/{zoo_id}/ticketshops/{ticketshop_id}                    |Delete a ticketshop resource in a zoo                                 |

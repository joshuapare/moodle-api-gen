

# CoreMessageGetMessagesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limitfrom** | **Integer** | limit from |  [optional] |
|**limitnum** | **Integer** | limit number |  [optional] |
|**newestfirst** | **Boolean** | true for ordering by newest first, false for oldest first |  [optional] |
|**read** | **Integer** | 1 for getting read messages, 0 for unread, 2 for both |  [optional] |
|**type** | **String** | type of message to return, expected values are: notifications, conversations and both |  [optional] |
|**useridfrom** | **Integer** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user |  [optional] |
|**useridto** | **Integer** | the user id who received the message, 0 for any user |  |




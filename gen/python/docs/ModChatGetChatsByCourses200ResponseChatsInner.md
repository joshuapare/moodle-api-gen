# ModChatGetChatsByCourses200ResponseChatsInner

Chats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatmethod** | **str** | chat method (sockets, ajax, header_js) | [optional] [default to 'null']
**chattime** | **int** | chat time | [optional] [default to null]
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**keepdays** | **int** | keep days | [optional] [default to null]
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**schedule** | **int** | schedule type | [optional] [default to null]
**section** | **int** | Course section id | [optional] 
**studentlogs** | **int** | student logs visible to everyone | [optional] [default to null]
**timemodified** | **int** | time of last modification | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_chats_by_courses200_response_chats_inner import ModChatGetChatsByCourses200ResponseChatsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatsByCourses200ResponseChatsInner from a JSON string
mod_chat_get_chats_by_courses200_response_chats_inner_instance = ModChatGetChatsByCourses200ResponseChatsInner.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatsByCourses200ResponseChatsInner.to_json())

# convert the object into a dict
mod_chat_get_chats_by_courses200_response_chats_inner_dict = mod_chat_get_chats_by_courses200_response_chats_inner_instance.to_dict()
# create an instance of ModChatGetChatsByCourses200ResponseChatsInner from a dict
mod_chat_get_chats_by_courses200_response_chats_inner_from_dict = ModChatGetChatsByCourses200ResponseChatsInner.from_dict(mod_chat_get_chats_by_courses200_response_chats_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



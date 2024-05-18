# Org.OpenAPITools.Model.CoreMessageGetConversation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**Id** | **int** | The conversation id | [default to null]
**Imageurl** | **string** | A link to the conversation picture, if set | [optional] [default to "null"]
**Isfavourite** | **bool** | If the user marked this conversation as a favourite | [default to null]
**Ismuted** | **bool** | If the user muted this conversation | [default to null]
**Isread** | **bool** | If the user has read all messages in the conversation | [default to null]
**Membercount** | **int** | Total number of conversation members | [default to null]
**Members** | [**List&lt;CoreMessageGetConversation200ResponseMembersInner&gt;**](CoreMessageGetConversation200ResponseMembersInner.md) |  | 
**Messages** | [**List&lt;CoreMessageGetConversation200ResponseMessagesInner&gt;**](CoreMessageGetConversation200ResponseMessagesInner.md) |  | 
**Name** | **string** | The conversation name, if set | [optional] [default to "null"]
**Subname** | **string** | A subtitle for the conversation name, if set | [optional] [default to "null"]
**Type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | [default to null]
**Unreadcount** | **int** | The number of unread messages in this conversation | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


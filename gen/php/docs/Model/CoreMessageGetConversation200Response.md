# # CoreMessageGetConversation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**id** | **int** | The conversation id | [default to null]
**imageurl** | **string** | A link to the conversation picture, if set | [optional] [default to 'null']
**isfavourite** | **bool** | If the user marked this conversation as a favourite | [default to null]
**ismuted** | **bool** | If the user muted this conversation | [default to null]
**isread** | **bool** | If the user has read all messages in the conversation | [default to null]
**membercount** | **int** | Total number of conversation members | [default to null]
**members** | [**\OpenAPI\Client\Model\CoreMessageGetConversation200ResponseMembersInner[]**](CoreMessageGetConversation200ResponseMembersInner.md) |  |
**messages** | [**\OpenAPI\Client\Model\CoreMessageGetConversation200ResponseMessagesInner[]**](CoreMessageGetConversation200ResponseMessagesInner.md) |  |
**name** | **string** | The conversation name, if set | [optional] [default to 'null']
**subname** | **string** | A subtitle for the conversation name, if set | [optional] [default to 'null']
**type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | [default to null]
**unreadcount** | **int** | The number of unread messages in this conversation | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

# # CoreMessageGetConversationBetweenUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**id** | **int** | The conversation id |
**imageurl** | **string** | A link to the conversation picture, if set | [optional]
**isfavourite** | **bool** | If the user marked this conversation as a favourite |
**ismuted** | **bool** | If the user muted this conversation |
**isread** | **bool** | If the user has read all messages in the conversation |
**membercount** | **int** | Total number of conversation members |
**members** | [**\OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsers200ResponseMembersInner[]**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  |
**messages** | [**\OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsers200ResponseMessagesInner[]**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  |
**name** | **string** | The conversation name, if set | [optional]
**subname** | **string** | A subtitle for the conversation name, if set | [optional]
**type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) |
**unreadcount** | **int** | The number of unread messages in this conversation | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

# # CoreMessageGetConversation200ResponseMembersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmessage** | **bool** | If the user can be messaged | [optional] [default to null]
**canmessageevenifblocked** | **bool** | If the user can still message even if they get blocked | [optional] [default to null]
**contactrequests** | [**\OpenAPI\Client\Model\CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner[]**](CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.md) |  | [optional]
**conversations** | [**\OpenAPI\Client\Model\CoreMessageGetConversation200ResponseMembersInnerConversationsInner[]**](CoreMessageGetConversation200ResponseMembersInnerConversationsInner.md) |  | [optional]
**fullname** | **string** | The user&#39;s name | [optional]
**id** | **int** | The user id | [optional]
**isblocked** | **bool** | If the user has been blocked | [optional]
**iscontact** | **bool** | Is the user a contact? | [optional] [default to null]
**isdeleted** | **bool** | Is the user deleted? | [optional] [default to null]
**isonline** | **bool** | The user&#39;s online status | [optional]
**profileimageurl** | **string** | User picture URL | [optional]
**profileimageurlsmall** | **string** | Small user picture URL | [optional]
**profileurl** | **string** | The link to the user&#39;s profile page | [optional] [default to 'null']
**requirescontact** | **bool** | If the user requires to be contacts | [optional] [default to null]
**showonlinestatus** | **bool** | Show the user&#39;s online status? | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
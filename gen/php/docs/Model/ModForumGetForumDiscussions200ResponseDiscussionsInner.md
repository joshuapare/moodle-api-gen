# # ModForumGetForumDiscussions200ResponseDiscussionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **string** | Has attachments? | [optional] [default to 'null']
**attachments** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**canfavourite** | **bool** | Can the user star the discussion | [optional] [default to null]
**canlock** | **bool** | Can the user lock the discussion | [optional] [default to null]
**canreply** | **bool** | Can the user reply to the discussion | [optional] [default to null]
**created** | **int** | Creation time | [optional] [default to null]
**discussion** | **int** | Discussion id | [optional] [default to null]
**groupid** | **int** | Group id | [optional]
**id** | **int** | Post id | [optional] [default to null]
**locked** | **bool** | Is the discussion locked | [optional] [default to null]
**mailed** | **int** | Mailed? | [optional] [default to null]
**mailnow** | **int** | Mail now? | [optional] [default to null]
**message** | **string** | The post message | [optional] [default to 'null']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**messageinlinefiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**messagetrust** | **int** | Can we trust? | [optional] [default to null]
**modified** | **int** | Time modified | [optional]
**name** | **string** | Discussion name | [optional] [default to 'null']
**numreplies** | **int** | The number of replies in the discussion | [optional] [default to null]
**numunread** | **int** | The number of unread discussions. | [optional] [default to null]
**parent** | **int** | Parent id | [optional] [default to null]
**pinned** | **bool** | Is the discussion pinned | [optional] [default to null]
**starred** | **bool** | Is the discussion starred | [optional] [default to null]
**subject** | **string** | The post subject | [optional] [default to 'null']
**timeend** | **int** | Time discussion ends | [optional] [default to null]
**timemodified** | **int** | Time modified | [optional]
**timestart** | **int** | Time discussion can start | [optional] [default to null]
**totalscore** | **int** | The post message total score | [optional] [default to null]
**userfullname** | **string** | Post author full name | [optional] [default to 'null']
**userid** | **int** | User who started the discussion id | [optional] [default to null]
**usermodified** | **int** | The id of the user who last modified | [optional] [default to null]
**usermodifiedfullname** | **string** | Post modifier full name | [optional] [default to 'null']
**usermodifiedpictureurl** | **string** | Post modifier picture. | [optional] [default to 'null']
**userpictureurl** | **string** | Post author picture. | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

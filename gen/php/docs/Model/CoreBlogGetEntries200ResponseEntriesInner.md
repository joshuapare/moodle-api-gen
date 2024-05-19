# # CoreBlogGetEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **string** | Post atachment. | [optional] [default to 'null']
**attachmentfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.md) |  | [optional]
**content** | **string** | Post content. | [optional] [default to 'null']
**courseid** | **int** | Course where the post was created. | [optional] [default to 0]
**coursemoduleid** | **int** | Course module id where the post was created. | [optional] [default to 0]
**created** | **int** | When it was created. | [optional] [default to 0]
**format** | **int** | Post content format. | [optional] [default to 0]
**groupid** | **int** | Group post was created for. | [optional] [default to 0]
**id** | **int** | Post/entry id. | [optional] [default to null]
**lastmodified** | **int** | When it was last modified. | [optional] [default to 0]
**module** | **string** | Where it was published the post (blog, blog_external...). | [optional] [default to 'null']
**moduleid** | **int** | Module id where the post was created (not used anymore). | [optional] [default to 0]
**publishstate** | **string** | Post publish state. | [optional] [default to 'draft']
**rating** | **int** | Post rating. | [optional] [default to 0]
**subject** | **string** | Post subject. | [optional] [default to 'null']
**summary** | **string** | Post summary. | [optional] [default to 'null']
**summaryfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**tags** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerTagsInner[]**](CoreBlogGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional]
**uniquehash** | **string** | Post unique hash. | [optional] [default to 'null']
**userid** | **int** | Post author. | [optional] [default to 0]
**usermodified** | **int** | User that updated the post. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

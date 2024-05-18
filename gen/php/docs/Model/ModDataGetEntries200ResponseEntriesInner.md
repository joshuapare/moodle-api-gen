# # ModDataGetEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry has been approved (if the database is configured in that way). | [optional] [default to 0]
**canmanageentry** | **bool** | Whether the current user can manage this entry | [optional] [default to null]
**contents** | [**\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerContentsInner[]**](ModDataGetEntries200ResponseEntriesInnerContentsInner.md) |  | [optional]
**dataid** | **int** | The database id this record belongs to. | [optional] [default to 0]
**fullname** | **string** | The user who created the entry fullname. | [optional] [default to 'null']
**groupid** | **int** | The group id this record belongs to (0 for no groups). | [optional] [default to 0]
**id** | **int** | Record id. | [optional] [default to null]
**tags** | [**\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional]
**timecreated** | **int** | Time the record was created. | [optional] [default to 0]
**timemodified** | **int** | Last time the record was modified. | [optional] [default to 0]
**userid** | **int** | The id of the user who created the record. | [optional] [default to 0]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

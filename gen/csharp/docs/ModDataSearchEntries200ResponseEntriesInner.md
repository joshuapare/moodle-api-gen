# MoodleClient.Model.ModDataSearchEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | **bool** | Whether the entry has been approved (if the database is configured in that way). | [optional] [default to 0]
**Canmanageentry** | **bool** | Whether the current user can manage this entry | [optional] 
**Contents** | [**List&lt;ModDataGetEntry200ResponseEntryContentsInner&gt;**](ModDataGetEntry200ResponseEntryContentsInner.md) |  | [optional] 
**Dataid** | **int** | The database id this record belongs to. | [optional] [default to 0]
**Fullname** | **string** | The user who created the entry fullname. | [optional] 
**Groupid** | **int** | The group id this record belongs to (0 for no groups). | [optional] [default to 0]
**Id** | **int** | Record id. | [optional] 
**Tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Timecreated** | **int** | Time the record was created. | [optional] [default to 0]
**Timemodified** | **int** | Last time the record was modified. | [optional] [default to 0]
**Userid** | **int** | The id of the user who created the record. | [optional] [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# ModDataSearchEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | Option<**bool**> | Whether the entry has been approved (if the database is configured in that way). | [optional][default to 0]
**canmanageentry** | Option<**bool**> | Whether the current user can manage this entry | [optional]
**contents** | Option<[**Vec<models::ModDataGetEntry200ResponseEntryContentsInner>**](mod_data_get_entry_200_response_entry_contents_inner.md)> |  | [optional]
**dataid** | Option<**i32**> | The database id this record belongs to. | [optional][default to 0]
**fullname** | Option<**String**> | The user who created the entry fullname. | [optional]
**groupid** | Option<**i32**> | The group id this record belongs to (0 for no groups). | [optional][default to 0]
**id** | Option<**i32**> | Record id. | [optional]
**tags** | Option<[**Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>**](mod_data_get_entries_200_response_entries_inner_tags_inner.md)> |  | [optional]
**timecreated** | Option<**i32**> | Time the record was created. | [optional][default to 0]
**timemodified** | Option<**i32**> | Last time the record was modified. | [optional][default to 0]
**userid** | Option<**i32**> | The id of the user who created the record. | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



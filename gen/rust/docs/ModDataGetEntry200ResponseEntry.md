# ModDataGetEntry200ResponseEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry has been approved (if the database is configured in that way). | [default to 0]
**canmanageentry** | **bool** | Whether the current user can manage this entry | 
**contents** | Option<[**Vec<models::ModDataGetEntry200ResponseEntryContentsInner>**](mod_data_get_entry_200_response_entry_contents_inner.md)> |  | [optional]
**dataid** | **i32** | The database id this record belongs to. | [default to 0]
**fullname** | Option<**String**> | The user who created the entry fullname. | [optional]
**groupid** | **i32** | The group id this record belongs to (0 for no groups). | [default to 0]
**id** | **i32** | Record id. | 
**tags** | Option<[**Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>**](mod_data_get_entries_200_response_entries_inner_tags_inner.md)> |  | [optional]
**timecreated** | **i32** | Time the record was created. | [default to 0]
**timemodified** | **i32** | Last time the record was modified. | [default to 0]
**userid** | **i32** | The id of the user who created the record. | [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



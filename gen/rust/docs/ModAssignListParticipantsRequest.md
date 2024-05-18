# ModAssignListParticipantsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignid** | **i32** | assign instance id | 
**filter** | **String** | search string to filter the results | [default to null]
**groupid** | **i32** | group id | 
**includeenrolments** | Option<**bool**> | Do return courses where the user is enrolled | [optional][default to true]
**limit** | Option<**i32**> | maximum number of records to return | [optional][default to 0]
**onlyids** | Option<**bool**> | Do not return all user fields | [optional][default to false]
**skip** | Option<**i32**> | number of records to skip | [optional][default to 0]
**tablesort** | Option<**bool**> | Apply current user table sorting preferences. | [optional][default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



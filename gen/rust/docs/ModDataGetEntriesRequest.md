# ModDataGetEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseid** | **i32** | data instance id | 
**groupid** | Option<**i32**> | Group id, 0 means that the function will determine the user group | [optional][default to 0]
**order** | Option<**String**> | The direction of the sorting: 'ASC' or 'DESC'.                                                 Empty for using the default database setting. | [optional][default to null]
**page** | Option<**i32**> | The page of records to return. | [optional][default to 0]
**perpage** | Option<**i32**> | The number of records to return per page | [optional][default to 0]
**returncontents** | Option<**bool**> | Whether to return contents or not. This will return each entry                                                         raw contents and the complete list view (using the template). | [optional][default to false]
**sort** | Option<**i32**> | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



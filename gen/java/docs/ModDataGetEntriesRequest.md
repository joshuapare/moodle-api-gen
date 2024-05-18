

# ModDataGetEntriesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**databaseid** | **Integer** | data instance id |  |
|**groupid** | **Integer** | Group id, 0 means that the function will determine the user group |  [optional] |
|**order** | **String** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. |  [optional] |
|**page** | **Integer** | The page of records to return. |  [optional] |
|**perpage** | **Integer** | The number of records to return per page |  [optional] |
|**returncontents** | **Boolean** | Whether to return contents or not. This will return each entry                                                         raw contents and the complete list view (using the template). |  [optional] |
|**sort** | **Integer** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. |  [optional] |




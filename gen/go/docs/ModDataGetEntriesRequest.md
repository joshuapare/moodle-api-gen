# ModDataGetEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Databaseid** | **int32** | data instance id | 
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**Order** | Pointer to **string** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. | [optional] [default to "null"]
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page | [optional] [default to 0]
**Returncontents** | Pointer to **bool** | Whether to return contents or not. This will return each entry                                                         raw contents and the complete list view (using the template). | [optional] [default to false]
**Sort** | Pointer to **int32** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional] [default to null]

## Methods

### NewModDataGetEntriesRequest

`func NewModDataGetEntriesRequest(databaseid int32, ) *ModDataGetEntriesRequest`

NewModDataGetEntriesRequest instantiates a new ModDataGetEntriesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntriesRequestWithDefaults

`func NewModDataGetEntriesRequestWithDefaults() *ModDataGetEntriesRequest`

NewModDataGetEntriesRequestWithDefaults instantiates a new ModDataGetEntriesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDatabaseid

`func (o *ModDataGetEntriesRequest) GetDatabaseid() int32`

GetDatabaseid returns the Databaseid field if non-nil, zero value otherwise.

### GetDatabaseidOk

`func (o *ModDataGetEntriesRequest) GetDatabaseidOk() (*int32, bool)`

GetDatabaseidOk returns a tuple with the Databaseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatabaseid

`func (o *ModDataGetEntriesRequest) SetDatabaseid(v int32)`

SetDatabaseid sets Databaseid field to given value.


### GetGroupid

`func (o *ModDataGetEntriesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModDataGetEntriesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModDataGetEntriesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModDataGetEntriesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetOrder

`func (o *ModDataGetEntriesRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *ModDataGetEntriesRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *ModDataGetEntriesRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *ModDataGetEntriesRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetPage

`func (o *ModDataGetEntriesRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModDataGetEntriesRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModDataGetEntriesRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModDataGetEntriesRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModDataGetEntriesRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModDataGetEntriesRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModDataGetEntriesRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModDataGetEntriesRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetReturncontents

`func (o *ModDataGetEntriesRequest) GetReturncontents() bool`

GetReturncontents returns the Returncontents field if non-nil, zero value otherwise.

### GetReturncontentsOk

`func (o *ModDataGetEntriesRequest) GetReturncontentsOk() (*bool, bool)`

GetReturncontentsOk returns a tuple with the Returncontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturncontents

`func (o *ModDataGetEntriesRequest) SetReturncontents(v bool)`

SetReturncontents sets Returncontents field to given value.

### HasReturncontents

`func (o *ModDataGetEntriesRequest) HasReturncontents() bool`

HasReturncontents returns a boolean if a field has been set.

### GetSort

`func (o *ModDataGetEntriesRequest) GetSort() int32`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModDataGetEntriesRequest) GetSortOk() (*int32, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModDataGetEntriesRequest) SetSort(v int32)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModDataGetEntriesRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



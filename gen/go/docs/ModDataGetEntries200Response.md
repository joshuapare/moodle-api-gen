# ModDataGetEntries200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entries** | [**[]ModDataGetEntries200ResponseEntriesInner**](ModDataGetEntries200ResponseEntriesInner.md) |  | 
**Listviewcontents** | Pointer to **string** | The list view contents as is rendered in the site. | [optional] [default to "null"]
**Totalcount** | **int32** | Total count of records. | [default to null]
**Totalfilesize** | **int32** | Total size (bytes) of the files included in the records. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataGetEntries200Response

`func NewModDataGetEntries200Response(entries []ModDataGetEntries200ResponseEntriesInner, totalcount int32, totalfilesize int32, ) *ModDataGetEntries200Response`

NewModDataGetEntries200Response instantiates a new ModDataGetEntries200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntries200ResponseWithDefaults

`func NewModDataGetEntries200ResponseWithDefaults() *ModDataGetEntries200Response`

NewModDataGetEntries200ResponseWithDefaults instantiates a new ModDataGetEntries200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntries

`func (o *ModDataGetEntries200Response) GetEntries() []ModDataGetEntries200ResponseEntriesInner`

GetEntries returns the Entries field if non-nil, zero value otherwise.

### GetEntriesOk

`func (o *ModDataGetEntries200Response) GetEntriesOk() (*[]ModDataGetEntries200ResponseEntriesInner, bool)`

GetEntriesOk returns a tuple with the Entries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntries

`func (o *ModDataGetEntries200Response) SetEntries(v []ModDataGetEntries200ResponseEntriesInner)`

SetEntries sets Entries field to given value.


### GetListviewcontents

`func (o *ModDataGetEntries200Response) GetListviewcontents() string`

GetListviewcontents returns the Listviewcontents field if non-nil, zero value otherwise.

### GetListviewcontentsOk

`func (o *ModDataGetEntries200Response) GetListviewcontentsOk() (*string, bool)`

GetListviewcontentsOk returns a tuple with the Listviewcontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListviewcontents

`func (o *ModDataGetEntries200Response) SetListviewcontents(v string)`

SetListviewcontents sets Listviewcontents field to given value.

### HasListviewcontents

`func (o *ModDataGetEntries200Response) HasListviewcontents() bool`

HasListviewcontents returns a boolean if a field has been set.

### GetTotalcount

`func (o *ModDataGetEntries200Response) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *ModDataGetEntries200Response) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *ModDataGetEntries200Response) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.


### GetTotalfilesize

`func (o *ModDataGetEntries200Response) GetTotalfilesize() int32`

GetTotalfilesize returns the Totalfilesize field if non-nil, zero value otherwise.

### GetTotalfilesizeOk

`func (o *ModDataGetEntries200Response) GetTotalfilesizeOk() (*int32, bool)`

GetTotalfilesizeOk returns a tuple with the Totalfilesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalfilesize

`func (o *ModDataGetEntries200Response) SetTotalfilesize(v int32)`

SetTotalfilesize sets Totalfilesize field to given value.


### GetWarnings

`func (o *ModDataGetEntries200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataGetEntries200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataGetEntries200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataGetEntries200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModDataSearchEntries200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entries** | [**[]ModDataSearchEntries200ResponseEntriesInner**](ModDataSearchEntries200ResponseEntriesInner.md) |  | 
**Listviewcontents** | Pointer to **string** | The list view contents as is rendered in the site. | [optional] 
**Maxcount** | Pointer to **int32** | Total count of records that the user could see in the database                     (if all the search criterias were removed). | [optional] [default to null]
**Totalcount** | **int32** | Total count of records returned by the search. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataSearchEntries200Response

`func NewModDataSearchEntries200Response(entries []ModDataSearchEntries200ResponseEntriesInner, totalcount int32, ) *ModDataSearchEntries200Response`

NewModDataSearchEntries200Response instantiates a new ModDataSearchEntries200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataSearchEntries200ResponseWithDefaults

`func NewModDataSearchEntries200ResponseWithDefaults() *ModDataSearchEntries200Response`

NewModDataSearchEntries200ResponseWithDefaults instantiates a new ModDataSearchEntries200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntries

`func (o *ModDataSearchEntries200Response) GetEntries() []ModDataSearchEntries200ResponseEntriesInner`

GetEntries returns the Entries field if non-nil, zero value otherwise.

### GetEntriesOk

`func (o *ModDataSearchEntries200Response) GetEntriesOk() (*[]ModDataSearchEntries200ResponseEntriesInner, bool)`

GetEntriesOk returns a tuple with the Entries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntries

`func (o *ModDataSearchEntries200Response) SetEntries(v []ModDataSearchEntries200ResponseEntriesInner)`

SetEntries sets Entries field to given value.


### GetListviewcontents

`func (o *ModDataSearchEntries200Response) GetListviewcontents() string`

GetListviewcontents returns the Listviewcontents field if non-nil, zero value otherwise.

### GetListviewcontentsOk

`func (o *ModDataSearchEntries200Response) GetListviewcontentsOk() (*string, bool)`

GetListviewcontentsOk returns a tuple with the Listviewcontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListviewcontents

`func (o *ModDataSearchEntries200Response) SetListviewcontents(v string)`

SetListviewcontents sets Listviewcontents field to given value.

### HasListviewcontents

`func (o *ModDataSearchEntries200Response) HasListviewcontents() bool`

HasListviewcontents returns a boolean if a field has been set.

### GetMaxcount

`func (o *ModDataSearchEntries200Response) GetMaxcount() int32`

GetMaxcount returns the Maxcount field if non-nil, zero value otherwise.

### GetMaxcountOk

`func (o *ModDataSearchEntries200Response) GetMaxcountOk() (*int32, bool)`

GetMaxcountOk returns a tuple with the Maxcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxcount

`func (o *ModDataSearchEntries200Response) SetMaxcount(v int32)`

SetMaxcount sets Maxcount field to given value.

### HasMaxcount

`func (o *ModDataSearchEntries200Response) HasMaxcount() bool`

HasMaxcount returns a boolean if a field has been set.

### GetTotalcount

`func (o *ModDataSearchEntries200Response) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *ModDataSearchEntries200Response) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *ModDataSearchEntries200Response) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.


### GetWarnings

`func (o *ModDataSearchEntries200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataSearchEntries200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataSearchEntries200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataSearchEntries200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModDataGetEntry200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entry** | [**ModDataGetEntry200ResponseEntry**](ModDataGetEntry200ResponseEntry.md) |  | 
**Entryviewcontents** | Pointer to **string** | The entry as is rendered in the site. | [optional] [default to "null"]
**Ratinginfo** | Pointer to [**ModDataGetEntry200ResponseRatinginfo**](ModDataGetEntry200ResponseRatinginfo.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataGetEntry200Response

`func NewModDataGetEntry200Response(entry ModDataGetEntry200ResponseEntry, ) *ModDataGetEntry200Response`

NewModDataGetEntry200Response instantiates a new ModDataGetEntry200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntry200ResponseWithDefaults

`func NewModDataGetEntry200ResponseWithDefaults() *ModDataGetEntry200Response`

NewModDataGetEntry200ResponseWithDefaults instantiates a new ModDataGetEntry200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntry

`func (o *ModDataGetEntry200Response) GetEntry() ModDataGetEntry200ResponseEntry`

GetEntry returns the Entry field if non-nil, zero value otherwise.

### GetEntryOk

`func (o *ModDataGetEntry200Response) GetEntryOk() (*ModDataGetEntry200ResponseEntry, bool)`

GetEntryOk returns a tuple with the Entry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntry

`func (o *ModDataGetEntry200Response) SetEntry(v ModDataGetEntry200ResponseEntry)`

SetEntry sets Entry field to given value.


### GetEntryviewcontents

`func (o *ModDataGetEntry200Response) GetEntryviewcontents() string`

GetEntryviewcontents returns the Entryviewcontents field if non-nil, zero value otherwise.

### GetEntryviewcontentsOk

`func (o *ModDataGetEntry200Response) GetEntryviewcontentsOk() (*string, bool)`

GetEntryviewcontentsOk returns a tuple with the Entryviewcontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryviewcontents

`func (o *ModDataGetEntry200Response) SetEntryviewcontents(v string)`

SetEntryviewcontents sets Entryviewcontents field to given value.

### HasEntryviewcontents

`func (o *ModDataGetEntry200Response) HasEntryviewcontents() bool`

HasEntryviewcontents returns a boolean if a field has been set.

### GetRatinginfo

`func (o *ModDataGetEntry200Response) GetRatinginfo() ModDataGetEntry200ResponseRatinginfo`

GetRatinginfo returns the Ratinginfo field if non-nil, zero value otherwise.

### GetRatinginfoOk

`func (o *ModDataGetEntry200Response) GetRatinginfoOk() (*ModDataGetEntry200ResponseRatinginfo, bool)`

GetRatinginfoOk returns a tuple with the Ratinginfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatinginfo

`func (o *ModDataGetEntry200Response) SetRatinginfo(v ModDataGetEntry200ResponseRatinginfo)`

SetRatinginfo sets Ratinginfo field to given value.

### HasRatinginfo

`func (o *ModDataGetEntry200Response) HasRatinginfo() bool`

HasRatinginfo returns a boolean if a field has been set.

### GetWarnings

`func (o *ModDataGetEntry200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataGetEntry200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataGetEntry200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataGetEntry200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



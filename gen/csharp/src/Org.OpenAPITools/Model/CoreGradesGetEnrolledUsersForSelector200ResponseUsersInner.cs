/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner
    /// </summary>
    [DataContract(Name = "core_grades_get_enrolled_users_for_selector_200_response_users_inner")]
    public partial class CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner" /> class.
        /// </summary>
        /// <param name="address">Postal address (default to &quot;null&quot;).</param>
        /// <param name="auth">Auth plugins include manual, ldap, etc (default to &quot;null&quot;).</param>
        /// <param name="calendartype">Calendar type such as \&quot;gregorian\&quot;, must exist on server (default to &quot;null&quot;).</param>
        /// <param name="city">Home city of the user (default to &quot;null&quot;).</param>
        /// <param name="confirmed">Active user: 1 if confirmed, 0 otherwise (default to null).</param>
        /// <param name="country">Home country code of the user, such as AU or CZ (default to &quot;null&quot;).</param>
        /// <param name="customfields">customfields.</param>
        /// <param name="department">department (default to &quot;null&quot;).</param>
        /// <param name="description">User profile description (default to &quot;null&quot;).</param>
        /// <param name="descriptionformat">int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to null).</param>
        /// <param name="email">An email address - allow email as root@localhost.</param>
        /// <param name="firstaccess">first access to the site (0 if never) (default to null).</param>
        /// <param name="firstname">The first name(s) of the user.</param>
        /// <param name="fullname">The fullname of the user (default to &quot;null&quot;).</param>
        /// <param name="id">ID of the user.</param>
        /// <param name="idnumber">An arbitrary ID code number perhaps from the institution (default to &quot;null&quot;).</param>
        /// <param name="institution">institution (default to &quot;null&quot;).</param>
        /// <param name="interests">user interests (separated by commas) (default to &quot;null&quot;).</param>
        /// <param name="lang">Language code such as \&quot;en\&quot;, must exist on server (default to &quot;null&quot;).</param>
        /// <param name="lastaccess">last access to the site (0 if never) (default to null).</param>
        /// <param name="lastname">The family name of the user.</param>
        /// <param name="mailformat">Mail format code is 0 for plain text, 1 for HTML etc (default to null).</param>
        /// <param name="phone1">Phone 1 (default to &quot;null&quot;).</param>
        /// <param name="phone2">Phone 2 (default to &quot;null&quot;).</param>
        /// <param name="preferences">preferences.</param>
        /// <param name="profileimageurl">User image profile URL - big version (default to &quot;null&quot;).</param>
        /// <param name="profileimageurlsmall">User image profile URL - small version (default to &quot;null&quot;).</param>
        /// <param name="suspended">Suspend user account, either false to enable user login or true to disable it (default to null).</param>
        /// <param name="theme">Theme name such as \&quot;standard\&quot;, must exist on server (default to &quot;null&quot;).</param>
        /// <param name="timezone">Timezone code such as Australia/Perth, or 99 for default (default to &quot;null&quot;).</param>
        /// <param name="username">The username (default to &quot;null&quot;).</param>
        public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner(string address = @"null", string auth = @"null", string calendartype = @"null", string city = @"null", bool confirmed = null, string country = @"null", List<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner> customfields = default(List<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner>), string department = @"null", string description = @"null", int descriptionformat = null, string email = default(string), int firstaccess = null, string firstname = default(string), string fullname = @"null", int id = default(int), string idnumber = @"null", string institution = @"null", string interests = @"null", string lang = @"null", int lastaccess = null, string lastname = default(string), int mailformat = null, string phone1 = @"null", string phone2 = @"null", List<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner> preferences = default(List<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner>), string profileimageurl = @"null", string profileimageurlsmall = @"null", bool suspended = null, string theme = @"null", string timezone = @"null", string username = @"null")
        {
            // use default value if no "address" provided
            this.Address = address ?? @"null";
            // use default value if no "auth" provided
            this.Auth = auth ?? @"null";
            // use default value if no "calendartype" provided
            this.Calendartype = calendartype ?? @"null";
            // use default value if no "city" provided
            this.City = city ?? @"null";
            this.Confirmed = confirmed;
            // use default value if no "country" provided
            this.Country = country ?? @"null";
            this.Customfields = customfields;
            // use default value if no "department" provided
            this.Department = department ?? @"null";
            // use default value if no "description" provided
            this.Description = description ?? @"null";
            this.Descriptionformat = descriptionformat;
            this.Email = email;
            this.Firstaccess = firstaccess;
            this.Firstname = firstname;
            // use default value if no "fullname" provided
            this.Fullname = fullname ?? @"null";
            this.Id = id;
            // use default value if no "idnumber" provided
            this.Idnumber = idnumber ?? @"null";
            // use default value if no "institution" provided
            this.Institution = institution ?? @"null";
            // use default value if no "interests" provided
            this.Interests = interests ?? @"null";
            // use default value if no "lang" provided
            this.Lang = lang ?? @"null";
            this.Lastaccess = lastaccess;
            this.Lastname = lastname;
            this.Mailformat = mailformat;
            // use default value if no "phone1" provided
            this.Phone1 = phone1 ?? @"null";
            // use default value if no "phone2" provided
            this.Phone2 = phone2 ?? @"null";
            this.Preferences = preferences;
            // use default value if no "profileimageurl" provided
            this.Profileimageurl = profileimageurl ?? @"null";
            // use default value if no "profileimageurlsmall" provided
            this.Profileimageurlsmall = profileimageurlsmall ?? @"null";
            this.Suspended = suspended;
            // use default value if no "theme" provided
            this.Theme = theme ?? @"null";
            // use default value if no "timezone" provided
            this.Timezone = timezone ?? @"null";
            // use default value if no "username" provided
            this.Username = username ?? @"null";
        }

        /// <summary>
        /// Postal address
        /// </summary>
        /// <value>Postal address</value>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public string Address { get; set; }

        /// <summary>
        /// Auth plugins include manual, ldap, etc
        /// </summary>
        /// <value>Auth plugins include manual, ldap, etc</value>
        [DataMember(Name = "auth", EmitDefaultValue = false)]
        public string Auth { get; set; }

        /// <summary>
        /// Calendar type such as \&quot;gregorian\&quot;, must exist on server
        /// </summary>
        /// <value>Calendar type such as \&quot;gregorian\&quot;, must exist on server</value>
        [DataMember(Name = "calendartype", EmitDefaultValue = false)]
        public string Calendartype { get; set; }

        /// <summary>
        /// Home city of the user
        /// </summary>
        /// <value>Home city of the user</value>
        [DataMember(Name = "city", EmitDefaultValue = false)]
        public string City { get; set; }

        /// <summary>
        /// Active user: 1 if confirmed, 0 otherwise
        /// </summary>
        /// <value>Active user: 1 if confirmed, 0 otherwise</value>
        [DataMember(Name = "confirmed", EmitDefaultValue = true)]
        public bool Confirmed { get; set; }

        /// <summary>
        /// Home country code of the user, such as AU or CZ
        /// </summary>
        /// <value>Home country code of the user, such as AU or CZ</value>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets Customfields
        /// </summary>
        [DataMember(Name = "customfields", EmitDefaultValue = false)]
        public List<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner> Customfields { get; set; }

        /// <summary>
        /// department
        /// </summary>
        /// <value>department</value>
        [DataMember(Name = "department", EmitDefaultValue = false)]
        public string Department { get; set; }

        /// <summary>
        /// User profile description
        /// </summary>
        /// <value>User profile description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// An email address - allow email as root@localhost
        /// </summary>
        /// <value>An email address - allow email as root@localhost</value>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// first access to the site (0 if never)
        /// </summary>
        /// <value>first access to the site (0 if never)</value>
        [DataMember(Name = "firstaccess", EmitDefaultValue = false)]
        public int Firstaccess { get; set; }

        /// <summary>
        /// The first name(s) of the user
        /// </summary>
        /// <value>The first name(s) of the user</value>
        [DataMember(Name = "firstname", EmitDefaultValue = false)]
        public string Firstname { get; set; }

        /// <summary>
        /// The fullname of the user
        /// </summary>
        /// <value>The fullname of the user</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// ID of the user
        /// </summary>
        /// <value>ID of the user</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// An arbitrary ID code number perhaps from the institution
        /// </summary>
        /// <value>An arbitrary ID code number perhaps from the institution</value>
        [DataMember(Name = "idnumber", EmitDefaultValue = false)]
        public string Idnumber { get; set; }

        /// <summary>
        /// institution
        /// </summary>
        /// <value>institution</value>
        [DataMember(Name = "institution", EmitDefaultValue = false)]
        public string Institution { get; set; }

        /// <summary>
        /// user interests (separated by commas)
        /// </summary>
        /// <value>user interests (separated by commas)</value>
        [DataMember(Name = "interests", EmitDefaultValue = false)]
        public string Interests { get; set; }

        /// <summary>
        /// Language code such as \&quot;en\&quot;, must exist on server
        /// </summary>
        /// <value>Language code such as \&quot;en\&quot;, must exist on server</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// last access to the site (0 if never)
        /// </summary>
        /// <value>last access to the site (0 if never)</value>
        [DataMember(Name = "lastaccess", EmitDefaultValue = false)]
        public int Lastaccess { get; set; }

        /// <summary>
        /// The family name of the user
        /// </summary>
        /// <value>The family name of the user</value>
        [DataMember(Name = "lastname", EmitDefaultValue = false)]
        public string Lastname { get; set; }

        /// <summary>
        /// Mail format code is 0 for plain text, 1 for HTML etc
        /// </summary>
        /// <value>Mail format code is 0 for plain text, 1 for HTML etc</value>
        [DataMember(Name = "mailformat", EmitDefaultValue = false)]
        public int Mailformat { get; set; }

        /// <summary>
        /// Phone 1
        /// </summary>
        /// <value>Phone 1</value>
        [DataMember(Name = "phone1", EmitDefaultValue = false)]
        public string Phone1 { get; set; }

        /// <summary>
        /// Phone 2
        /// </summary>
        /// <value>Phone 2</value>
        [DataMember(Name = "phone2", EmitDefaultValue = false)]
        public string Phone2 { get; set; }

        /// <summary>
        /// Gets or Sets Preferences
        /// </summary>
        [DataMember(Name = "preferences", EmitDefaultValue = false)]
        public List<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner> Preferences { get; set; }

        /// <summary>
        /// User image profile URL - big version
        /// </summary>
        /// <value>User image profile URL - big version</value>
        [DataMember(Name = "profileimageurl", EmitDefaultValue = false)]
        public string Profileimageurl { get; set; }

        /// <summary>
        /// User image profile URL - small version
        /// </summary>
        /// <value>User image profile URL - small version</value>
        [DataMember(Name = "profileimageurlsmall", EmitDefaultValue = false)]
        public string Profileimageurlsmall { get; set; }

        /// <summary>
        /// Suspend user account, either false to enable user login or true to disable it
        /// </summary>
        /// <value>Suspend user account, either false to enable user login or true to disable it</value>
        [DataMember(Name = "suspended", EmitDefaultValue = true)]
        public bool Suspended { get; set; }

        /// <summary>
        /// Theme name such as \&quot;standard\&quot;, must exist on server
        /// </summary>
        /// <value>Theme name such as \&quot;standard\&quot;, must exist on server</value>
        [DataMember(Name = "theme", EmitDefaultValue = false)]
        public string Theme { get; set; }

        /// <summary>
        /// Timezone code such as Australia/Perth, or 99 for default
        /// </summary>
        /// <value>Timezone code such as Australia/Perth, or 99 for default</value>
        [DataMember(Name = "timezone", EmitDefaultValue = false)]
        public string Timezone { get; set; }

        /// <summary>
        /// The username
        /// </summary>
        /// <value>The username</value>
        [DataMember(Name = "username", EmitDefaultValue = false)]
        public string Username { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner {\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Auth: ").Append(Auth).Append("\n");
            sb.Append("  Calendartype: ").Append(Calendartype).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  Confirmed: ").Append(Confirmed).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Customfields: ").Append(Customfields).Append("\n");
            sb.Append("  Department: ").Append(Department).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Firstaccess: ").Append(Firstaccess).Append("\n");
            sb.Append("  Firstname: ").Append(Firstname).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Institution: ").Append(Institution).Append("\n");
            sb.Append("  Interests: ").Append(Interests).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Lastaccess: ").Append(Lastaccess).Append("\n");
            sb.Append("  Lastname: ").Append(Lastname).Append("\n");
            sb.Append("  Mailformat: ").Append(Mailformat).Append("\n");
            sb.Append("  Phone1: ").Append(Phone1).Append("\n");
            sb.Append("  Phone2: ").Append(Phone2).Append("\n");
            sb.Append("  Preferences: ").Append(Preferences).Append("\n");
            sb.Append("  Profileimageurl: ").Append(Profileimageurl).Append("\n");
            sb.Append("  Profileimageurlsmall: ").Append(Profileimageurlsmall).Append("\n");
            sb.Append("  Suspended: ").Append(Suspended).Append("\n");
            sb.Append("  Theme: ").Append(Theme).Append("\n");
            sb.Append("  Timezone: ").Append(Timezone).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
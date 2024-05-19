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
    /// CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner
    /// </summary>
    [DataContract(Name = "core_grades_get_enrolled_users_for_search_widget_200_response_users_inner")]
    public partial class CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner" /> class.
        /// </summary>
        /// <param name="active">Are we currently on this item? (default to null).</param>
        /// <param name="email">An email address - allow email as root@localhost (default to &quot;null&quot;).</param>
        /// <param name="fullname">The full name of the user.</param>
        /// <param name="id">ID of the user.</param>
        /// <param name="profileimage">The location of the users larger image.</param>
        /// <param name="url">The link to the user report (default to &quot;null&quot;).</param>
        public CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner(bool active = null, string email = @"null", string fullname = default(string), int id = default(int), string profileimage = default(string), string url = @"null")
        {
            this.Active = active;
            // use default value if no "email" provided
            this.Email = email ?? @"null";
            this.Fullname = fullname;
            this.Id = id;
            this.Profileimage = profileimage;
            // use default value if no "url" provided
            this.Url = url ?? @"null";
        }

        /// <summary>
        /// Are we currently on this item?
        /// </summary>
        /// <value>Are we currently on this item?</value>
        [DataMember(Name = "active", EmitDefaultValue = true)]
        public bool Active { get; set; }

        /// <summary>
        /// An email address - allow email as root@localhost
        /// </summary>
        /// <value>An email address - allow email as root@localhost</value>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// The full name of the user
        /// </summary>
        /// <value>The full name of the user</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// ID of the user
        /// </summary>
        /// <value>ID of the user</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// The location of the users larger image
        /// </summary>
        /// <value>The location of the users larger image</value>
        [DataMember(Name = "profileimage", EmitDefaultValue = false)]
        public string Profileimage { get; set; }

        /// <summary>
        /// The link to the user report
        /// </summary>
        /// <value>The link to the user report</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner {\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Profileimage: ").Append(Profileimage).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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

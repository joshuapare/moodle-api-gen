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
    /// CoreUserViewUserProfileRequest
    /// </summary>
    [DataContract(Name = "core_user_view_user_profile_request")]
    public partial class CoreUserViewUserProfileRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUserViewUserProfileRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreUserViewUserProfileRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUserViewUserProfileRequest" /> class.
        /// </summary>
        /// <param name="courseid">id of the course, default site course (default to 0).</param>
        /// <param name="userid">id of the user, 0 for current user (required).</param>
        public CoreUserViewUserProfileRequest(int courseid = 0, int userid = default(int))
        {
            this.Userid = userid;
            this.Courseid = courseid;
        }

        /// <summary>
        /// id of the course, default site course
        /// </summary>
        /// <value>id of the course, default site course</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// id of the user, 0 for current user
        /// </summary>
        /// <value>id of the user, 0 for current user</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreUserViewUserProfileRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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

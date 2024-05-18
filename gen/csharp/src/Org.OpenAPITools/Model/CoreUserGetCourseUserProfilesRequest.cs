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
    /// CoreUserGetCourseUserProfilesRequest
    /// </summary>
    [DataContract(Name = "core_user_get_course_user_profiles_request")]
    public partial class CoreUserGetCourseUserProfilesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUserGetCourseUserProfilesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreUserGetCourseUserProfilesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUserGetCourseUserProfilesRequest" /> class.
        /// </summary>
        /// <param name="userlist">userlist (required).</param>
        public CoreUserGetCourseUserProfilesRequest(List<CoreUserGetCourseUserProfilesRequestUserlistInner> userlist = default(List<CoreUserGetCourseUserProfilesRequestUserlistInner>))
        {
            // to ensure "userlist" is required (not null)
            if (userlist == null)
            {
                throw new ArgumentNullException("userlist is a required property for CoreUserGetCourseUserProfilesRequest and cannot be null");
            }
            this.Userlist = userlist;
        }

        /// <summary>
        /// Gets or Sets Userlist
        /// </summary>
        [DataMember(Name = "userlist", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreUserGetCourseUserProfilesRequestUserlistInner> Userlist { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreUserGetCourseUserProfilesRequest {\n");
            sb.Append("  Userlist: ").Append(Userlist).Append("\n");
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

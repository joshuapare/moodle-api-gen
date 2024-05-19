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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreGradesGetGradableUsersRequest
    /// </summary>
    [DataContract(Name = "core_grades_get_gradable_users_request")]
    public partial class CoreGradesGetGradableUsersRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetGradableUsersRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGradesGetGradableUsersRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetGradableUsersRequest" /> class.
        /// </summary>
        /// <param name="courseid">Course Id (required).</param>
        /// <param name="groupid">Group Id (default to 0).</param>
        /// <param name="onlyactive">Only active enrolment (default to false).</param>
        public CoreGradesGetGradableUsersRequest(int courseid = default(int), int groupid = 0, bool onlyactive = false)
        {
            this.Courseid = courseid;
            this.Groupid = groupid;
            this.Onlyactive = onlyactive;
        }

        /// <summary>
        /// Course Id
        /// </summary>
        /// <value>Course Id</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Group Id
        /// </summary>
        /// <value>Group Id</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Only active enrolment
        /// </summary>
        /// <value>Only active enrolment</value>
        [DataMember(Name = "onlyactive", EmitDefaultValue = true)]
        public bool Onlyactive { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGetGradableUsersRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Onlyactive: ").Append(Onlyactive).Append("\n");
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

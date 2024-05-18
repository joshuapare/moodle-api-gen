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
    /// CoreGradesGetFeedbackRequest
    /// </summary>
    [DataContract(Name = "core_grades_get_feedback_request")]
    public partial class CoreGradesGetFeedbackRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetFeedbackRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGradesGetFeedbackRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetFeedbackRequest" /> class.
        /// </summary>
        /// <param name="courseid">Course ID (required).</param>
        /// <param name="itemid">Grade Item ID (required) (default to null).</param>
        /// <param name="userid">User ID (required).</param>
        public CoreGradesGetFeedbackRequest(int courseid = default(int), int itemid = null, int userid = default(int))
        {
            this.Courseid = courseid;
            this.Itemid = itemid;
            this.Userid = userid;
        }

        /// <summary>
        /// Course ID
        /// </summary>
        /// <value>Course ID</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Grade Item ID
        /// </summary>
        /// <value>Grade Item ID</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// User ID
        /// </summary>
        /// <value>User ID</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGetFeedbackRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
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

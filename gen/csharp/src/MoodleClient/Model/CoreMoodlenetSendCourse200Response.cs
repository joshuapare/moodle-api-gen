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
    /// CoreMoodlenetSendCourse200Response
    /// </summary>
    [DataContract(Name = "core_moodlenet_send_course_200_response")]
    public partial class CoreMoodlenetSendCourse200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMoodlenetSendCourse200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMoodlenetSendCourse200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMoodlenetSendCourse200Response" /> class.
        /// </summary>
        /// <param name="resourceurl">Resource URL from MoodleNet (required).</param>
        /// <param name="status">Status: true if success (required).</param>
        /// <param name="warnings">warnings.</param>
        public CoreMoodlenetSendCourse200Response(string resourceurl = default(string), bool status = default(bool), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "resourceurl" is required (not null)
            if (resourceurl == null)
            {
                throw new ArgumentNullException("resourceurl is a required property for CoreMoodlenetSendCourse200Response and cannot be null");
            }
            this.Resourceurl = resourceurl;
            this.Status = status;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Resource URL from MoodleNet
        /// </summary>
        /// <value>Resource URL from MoodleNet</value>
        [DataMember(Name = "resourceurl", IsRequired = true, EmitDefaultValue = true)]
        public string Resourceurl { get; set; }

        /// <summary>
        /// Status: true if success
        /// </summary>
        /// <value>Status: true if success</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMoodlenetSendCourse200Response {\n");
            sb.Append("  Resourceurl: ").Append(Resourceurl).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
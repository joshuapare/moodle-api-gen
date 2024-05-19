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
    /// ModLessonFinishAttemptRequest
    /// </summary>
    [DataContract(Name = "mod_lesson_finish_attempt_request")]
    public partial class ModLessonFinishAttemptRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonFinishAttemptRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonFinishAttemptRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonFinishAttemptRequest" /> class.
        /// </summary>
        /// <param name="lessonid">Lesson instance id. (required) (default to null).</param>
        /// <param name="outoftime">If the user run out of time. (default to false).</param>
        /// <param name="password">Optional password (the lesson may be protected). (default to &quot;&quot;).</param>
        /// <param name="review">If we want to review just after finishing (1 hour margin). (default to false).</param>
        public ModLessonFinishAttemptRequest(int lessonid = null, bool outoftime = false, string password = @"", bool review = false)
        {
            this.Lessonid = lessonid;
            this.Outoftime = outoftime;
            // use default value if no "password" provided
            this.Password = password ?? @"";
            this.Review = review;
        }

        /// <summary>
        /// Lesson instance id.
        /// </summary>
        /// <value>Lesson instance id.</value>
        [DataMember(Name = "lessonid", IsRequired = true, EmitDefaultValue = true)]
        public int Lessonid { get; set; }

        /// <summary>
        /// If the user run out of time.
        /// </summary>
        /// <value>If the user run out of time.</value>
        [DataMember(Name = "outoftime", EmitDefaultValue = true)]
        public bool Outoftime { get; set; }

        /// <summary>
        /// Optional password (the lesson may be protected).
        /// </summary>
        /// <value>Optional password (the lesson may be protected).</value>
        [DataMember(Name = "password", EmitDefaultValue = false)]
        public string Password { get; set; }

        /// <summary>
        /// If we want to review just after finishing (1 hour margin).
        /// </summary>
        /// <value>If we want to review just after finishing (1 hour margin).</value>
        [DataMember(Name = "review", EmitDefaultValue = true)]
        public bool Review { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonFinishAttemptRequest {\n");
            sb.Append("  Lessonid: ").Append(Lessonid).Append("\n");
            sb.Append("  Outoftime: ").Append(Outoftime).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Review: ").Append(Review).Append("\n");
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

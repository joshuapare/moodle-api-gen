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
    /// ModLessonGetUserAttempt200ResponseUserstats
    /// </summary>
    [DataContract(Name = "mod_lesson_get_user_attempt_200_response_userstats")]
    public partial class ModLessonGetUserAttempt200ResponseUserstats : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttempt200ResponseUserstats" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonGetUserAttempt200ResponseUserstats() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttempt200ResponseUserstats" /> class.
        /// </summary>
        /// <param name="completed">Time completed. (required) (default to null).</param>
        /// <param name="grade">Attempt final grade. (required) (default to nullM).</param>
        /// <param name="gradeinfo">gradeinfo.</param>
        /// <param name="timetotake">Time taken. (required) (default to null).</param>
        public ModLessonGetUserAttempt200ResponseUserstats(int completed = null, decimal grade = nullM, ModLessonGetUserAttempt200ResponseUserstatsGradeinfo gradeinfo = default(ModLessonGetUserAttempt200ResponseUserstatsGradeinfo), int timetotake = null)
        {
            this.Completed = completed;
            this.Grade = grade;
            this.Timetotake = timetotake;
            this.Gradeinfo = gradeinfo;
        }

        /// <summary>
        /// Time completed.
        /// </summary>
        /// <value>Time completed.</value>
        [DataMember(Name = "completed", IsRequired = true, EmitDefaultValue = true)]
        public int Completed { get; set; }

        /// <summary>
        /// Attempt final grade.
        /// </summary>
        /// <value>Attempt final grade.</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public decimal Grade { get; set; }

        /// <summary>
        /// Gets or Sets Gradeinfo
        /// </summary>
        [DataMember(Name = "gradeinfo", EmitDefaultValue = false)]
        public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo Gradeinfo { get; set; }

        /// <summary>
        /// Time taken.
        /// </summary>
        /// <value>Time taken.</value>
        [DataMember(Name = "timetotake", IsRequired = true, EmitDefaultValue = true)]
        public int Timetotake { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetUserAttempt200ResponseUserstats {\n");
            sb.Append("  Completed: ").Append(Completed).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradeinfo: ").Append(Gradeinfo).Append("\n");
            sb.Append("  Timetotake: ").Append(Timetotake).Append("\n");
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

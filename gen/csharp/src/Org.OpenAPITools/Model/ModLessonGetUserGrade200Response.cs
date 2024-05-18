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
    /// ModLessonGetUserGrade200Response
    /// </summary>
    [DataContract(Name = "mod_lesson_get_user_grade_200_response")]
    public partial class ModLessonGetUserGrade200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserGrade200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonGetUserGrade200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserGrade200Response" /> class.
        /// </summary>
        /// <param name="formattedgrade">The lesson final grade formatted (required) (default to &quot;null&quot;).</param>
        /// <param name="grade">The lesson final raw grade (required) (default to nullM).</param>
        /// <param name="warnings">warnings.</param>
        public ModLessonGetUserGrade200Response(string formattedgrade = @"null", decimal grade = nullM, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "formattedgrade" is required (not null)
            if (formattedgrade == null)
            {
                throw new ArgumentNullException("formattedgrade is a required property for ModLessonGetUserGrade200Response and cannot be null");
            }
            this.Formattedgrade = formattedgrade;
            this.Grade = grade;
            this.Warnings = warnings;
        }

        /// <summary>
        /// The lesson final grade formatted
        /// </summary>
        /// <value>The lesson final grade formatted</value>
        [DataMember(Name = "formattedgrade", IsRequired = true, EmitDefaultValue = true)]
        public string Formattedgrade { get; set; }

        /// <summary>
        /// The lesson final raw grade
        /// </summary>
        /// <value>The lesson final raw grade</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public decimal Grade { get; set; }

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
            sb.Append("class ModLessonGetUserGrade200Response {\n");
            sb.Append("  Formattedgrade: ").Append(Formattedgrade).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
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

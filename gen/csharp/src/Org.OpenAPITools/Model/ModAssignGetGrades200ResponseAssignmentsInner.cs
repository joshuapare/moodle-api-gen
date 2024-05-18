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
    /// ModAssignGetGrades200ResponseAssignmentsInner
    /// </summary>
    [DataContract(Name = "mod_assign_get_grades_200_response_assignments_inner")]
    public partial class ModAssignGetGrades200ResponseAssignmentsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetGrades200ResponseAssignmentsInner" /> class.
        /// </summary>
        /// <param name="assignmentid">assignment id.</param>
        /// <param name="grades">grades.</param>
        public ModAssignGetGrades200ResponseAssignmentsInner(int assignmentid = default(int), List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner> grades = default(List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner>))
        {
            this.Assignmentid = assignmentid;
            this.Grades = grades;
        }

        /// <summary>
        /// assignment id
        /// </summary>
        /// <value>assignment id</value>
        [DataMember(Name = "assignmentid", EmitDefaultValue = false)]
        public int Assignmentid { get; set; }

        /// <summary>
        /// Gets or Sets Grades
        /// </summary>
        [DataMember(Name = "grades", EmitDefaultValue = false)]
        public List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner> Grades { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetGrades200ResponseAssignmentsInner {\n");
            sb.Append("  Assignmentid: ").Append(Assignmentid).Append("\n");
            sb.Append("  Grades: ").Append(Grades).Append("\n");
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

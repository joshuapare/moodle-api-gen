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
    /// CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
    /// </summary>
    [DataContract(Name = "core_grading_save_definitions_request_areas_inner_definitions_inner")]
    public partial class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner" /> class.
        /// </summary>
        /// <param name="copiedfromid">copied from id.</param>
        /// <param name="description">description.</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="guide">guide.</param>
        /// <param name="id">definition id.</param>
        /// <param name="method">method.</param>
        /// <param name="name">name.</param>
        /// <param name="rubric">rubric.</param>
        /// <param name="status">status.</param>
        /// <param name="timecopied">time copied.</param>
        /// <param name="timecreated">creation time.</param>
        /// <param name="timemodified">last modified time.</param>
        /// <param name="usercreated">user who created definition.</param>
        /// <param name="usermodified">user who modified definition.</param>
        public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner(int copiedfromid = default(int), string description = default(string), int descriptionformat = default(int), CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide guide = default(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide), int id = default(int), string method = default(string), string name = default(string), CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric rubric = default(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric), int status = default(int), int timecopied = default(int), int timecreated = default(int), int timemodified = default(int), int usercreated = default(int), int usermodified = default(int))
        {
            this.Copiedfromid = copiedfromid;
            this.Description = description;
            this.Descriptionformat = descriptionformat;
            this.Guide = guide;
            this.Id = id;
            this.Method = method;
            this.Name = name;
            this.Rubric = rubric;
            this.Status = status;
            this.Timecopied = timecopied;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Usercreated = usercreated;
            this.Usermodified = usermodified;
        }

        /// <summary>
        /// copied from id
        /// </summary>
        /// <value>copied from id</value>
        [DataMember(Name = "copiedfromid", EmitDefaultValue = false)]
        public int Copiedfromid { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// Gets or Sets Guide
        /// </summary>
        [DataMember(Name = "guide", EmitDefaultValue = false)]
        public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide Guide { get; set; }

        /// <summary>
        /// definition id
        /// </summary>
        /// <value>definition id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// method
        /// </summary>
        /// <value>method</value>
        [DataMember(Name = "method", EmitDefaultValue = false)]
        public string Method { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Rubric
        /// </summary>
        [DataMember(Name = "rubric", EmitDefaultValue = false)]
        public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric Rubric { get; set; }

        /// <summary>
        /// status
        /// </summary>
        /// <value>status</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public int Status { get; set; }

        /// <summary>
        /// time copied
        /// </summary>
        /// <value>time copied</value>
        [DataMember(Name = "timecopied", EmitDefaultValue = false)]
        public int Timecopied { get; set; }

        /// <summary>
        /// creation time
        /// </summary>
        /// <value>creation time</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// last modified time
        /// </summary>
        /// <value>last modified time</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// user who created definition
        /// </summary>
        /// <value>user who created definition</value>
        [DataMember(Name = "usercreated", EmitDefaultValue = false)]
        public int Usercreated { get; set; }

        /// <summary>
        /// user who modified definition
        /// </summary>
        /// <value>user who modified definition</value>
        [DataMember(Name = "usermodified", EmitDefaultValue = false)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner {\n");
            sb.Append("  Copiedfromid: ").Append(Copiedfromid).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Guide: ").Append(Guide).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Rubric: ").Append(Rubric).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Timecopied: ").Append(Timecopied).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Usercreated: ").Append(Usercreated).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
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

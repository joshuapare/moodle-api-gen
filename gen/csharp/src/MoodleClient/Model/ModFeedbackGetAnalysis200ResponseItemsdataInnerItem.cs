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
    /// ModFeedbackGetAnalysis200ResponseItemsdataInnerItem
    /// </summary>
    [DataContract(Name = "mod_feedback_get_analysis_200_response_itemsdata_inner_item")]
    public partial class ModFeedbackGetAnalysis200ResponseItemsdataInnerItem : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetAnalysis200ResponseItemsdataInnerItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModFeedbackGetAnalysis200ResponseItemsdataInnerItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetAnalysis200ResponseItemsdataInnerItem" /> class.
        /// </summary>
        /// <param name="dependitem">The item id this item depend on. (required) (default to 0).</param>
        /// <param name="dependvalue">The depend value. (required) (default to &quot;null&quot;).</param>
        /// <param name="feedback">The feedback instance id this records belongs to. (required) (default to 0).</param>
        /// <param name="hasvalue">Whether it has a value or not. (required) (default to 0).</param>
        /// <param name="id">The record id. (required) (default to null).</param>
        /// <param name="itemfiles">itemfiles (required).</param>
        /// <param name="itemnumber">The item position number (required) (default to null).</param>
        /// <param name="label">The item label. (required) (default to &quot;null&quot;).</param>
        /// <param name="name">The item name. (required) (default to &quot;null&quot;).</param>
        /// <param name="options">Different additional settings for the item (question). (required) (default to &quot;null&quot;).</param>
        /// <param name="otherdata">Additional data that may be required by external functions (required) (default to &quot;null&quot;).</param>
        /// <param name="position">The position in the list of questions. (required) (default to 0).</param>
        /// <param name="presentation">The text describing the item or the available possible answers. (required) (default to &quot;null&quot;).</param>
        /// <param name="required">Whether is a item (question) required or not. (required) (default to 0).</param>
        /// <param name="template">If it belogns to a template, the template id. (required) (default to 0).</param>
        /// <param name="typ">The type of the item. (required) (default to &quot;null&quot;).</param>
        public ModFeedbackGetAnalysis200ResponseItemsdataInnerItem(int dependitem = 0, string dependvalue = @"null", int feedback = 0, int hasvalue = 0, int id = null, List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> itemfiles = default(List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>), int itemnumber = null, string label = @"null", string name = @"null", string options = @"null", string otherdata = @"null", int position = 0, string presentation = @"null", bool required = 0, int template = 0, string typ = @"null")
        {
            this.Dependitem = dependitem;
            // to ensure "dependvalue" is required (not null)
            if (dependvalue == null)
            {
                throw new ArgumentNullException("dependvalue is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Dependvalue = dependvalue;
            this.Feedback = feedback;
            this.Hasvalue = hasvalue;
            this.Id = id;
            // to ensure "itemfiles" is required (not null)
            if (itemfiles == null)
            {
                throw new ArgumentNullException("itemfiles is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Itemfiles = itemfiles;
            this.Itemnumber = itemnumber;
            // to ensure "label" is required (not null)
            if (label == null)
            {
                throw new ArgumentNullException("label is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Label = label;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Name = name;
            // to ensure "options" is required (not null)
            if (options == null)
            {
                throw new ArgumentNullException("options is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Options = options;
            // to ensure "otherdata" is required (not null)
            if (otherdata == null)
            {
                throw new ArgumentNullException("otherdata is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Otherdata = otherdata;
            this.Position = position;
            // to ensure "presentation" is required (not null)
            if (presentation == null)
            {
                throw new ArgumentNullException("presentation is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Presentation = presentation;
            this.Required = required;
            this.Template = template;
            // to ensure "typ" is required (not null)
            if (typ == null)
            {
                throw new ArgumentNullException("typ is a required property for ModFeedbackGetAnalysis200ResponseItemsdataInnerItem and cannot be null");
            }
            this.Typ = typ;
        }

        /// <summary>
        /// The item id this item depend on.
        /// </summary>
        /// <value>The item id this item depend on.</value>
        [DataMember(Name = "dependitem", IsRequired = true, EmitDefaultValue = true)]
        public int Dependitem { get; set; }

        /// <summary>
        /// The depend value.
        /// </summary>
        /// <value>The depend value.</value>
        [DataMember(Name = "dependvalue", IsRequired = true, EmitDefaultValue = true)]
        public string Dependvalue { get; set; }

        /// <summary>
        /// The feedback instance id this records belongs to.
        /// </summary>
        /// <value>The feedback instance id this records belongs to.</value>
        [DataMember(Name = "feedback", IsRequired = true, EmitDefaultValue = true)]
        public int Feedback { get; set; }

        /// <summary>
        /// Whether it has a value or not.
        /// </summary>
        /// <value>Whether it has a value or not.</value>
        [DataMember(Name = "hasvalue", IsRequired = true, EmitDefaultValue = true)]
        public int Hasvalue { get; set; }

        /// <summary>
        /// The record id.
        /// </summary>
        /// <value>The record id.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Itemfiles
        /// </summary>
        [DataMember(Name = "itemfiles", IsRequired = true, EmitDefaultValue = true)]
        public List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> Itemfiles { get; set; }

        /// <summary>
        /// The item position number
        /// </summary>
        /// <value>The item position number</value>
        [DataMember(Name = "itemnumber", IsRequired = true, EmitDefaultValue = true)]
        public int Itemnumber { get; set; }

        /// <summary>
        /// The item label.
        /// </summary>
        /// <value>The item label.</value>
        [DataMember(Name = "label", IsRequired = true, EmitDefaultValue = true)]
        public string Label { get; set; }

        /// <summary>
        /// The item name.
        /// </summary>
        /// <value>The item name.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Different additional settings for the item (question).
        /// </summary>
        /// <value>Different additional settings for the item (question).</value>
        [DataMember(Name = "options", IsRequired = true, EmitDefaultValue = true)]
        public string Options { get; set; }

        /// <summary>
        /// Additional data that may be required by external functions
        /// </summary>
        /// <value>Additional data that may be required by external functions</value>
        [DataMember(Name = "otherdata", IsRequired = true, EmitDefaultValue = true)]
        public string Otherdata { get; set; }

        /// <summary>
        /// The position in the list of questions.
        /// </summary>
        /// <value>The position in the list of questions.</value>
        [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = true)]
        public int Position { get; set; }

        /// <summary>
        /// The text describing the item or the available possible answers.
        /// </summary>
        /// <value>The text describing the item or the available possible answers.</value>
        [DataMember(Name = "presentation", IsRequired = true, EmitDefaultValue = true)]
        public string Presentation { get; set; }

        /// <summary>
        /// Whether is a item (question) required or not.
        /// </summary>
        /// <value>Whether is a item (question) required or not.</value>
        [DataMember(Name = "required", IsRequired = true, EmitDefaultValue = true)]
        public bool Required { get; set; }

        /// <summary>
        /// If it belogns to a template, the template id.
        /// </summary>
        /// <value>If it belogns to a template, the template id.</value>
        [DataMember(Name = "template", IsRequired = true, EmitDefaultValue = true)]
        public int Template { get; set; }

        /// <summary>
        /// The type of the item.
        /// </summary>
        /// <value>The type of the item.</value>
        [DataMember(Name = "typ", IsRequired = true, EmitDefaultValue = true)]
        public string Typ { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFeedbackGetAnalysis200ResponseItemsdataInnerItem {\n");
            sb.Append("  Dependitem: ").Append(Dependitem).Append("\n");
            sb.Append("  Dependvalue: ").Append(Dependvalue).Append("\n");
            sb.Append("  Feedback: ").Append(Feedback).Append("\n");
            sb.Append("  Hasvalue: ").Append(Hasvalue).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Itemfiles: ").Append(Itemfiles).Append("\n");
            sb.Append("  Itemnumber: ").Append(Itemnumber).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  Otherdata: ").Append(Otherdata).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Presentation: ").Append(Presentation).Append("\n");
            sb.Append("  Required: ").Append(Required).Append("\n");
            sb.Append("  Template: ").Append(Template).Append("\n");
            sb.Append("  Typ: ").Append(Typ).Append("\n");
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